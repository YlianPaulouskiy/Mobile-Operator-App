package by.step.mapper;

import by.step.dto.tariffDto.TariffDto;
import by.step.dto.tariffDto.TariffDtoWithId;
import by.step.dto.tariffDto.TariffDtoWithoutId;
import by.step.dto.tariffDto.TariffPhoneDto;
import by.step.entity.Phone;
import by.step.entity.Tariff;
import org.mapstruct.*;

import java.util.List;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = "spring"
)
public interface TariffMapper {

    Tariff convert(TariffDto tariffDto);

    Tariff convert(TariffDtoWithId tariffDtoWithId);

    Tariff convert(TariffPhoneDto tariffPhoneDto);

    Tariff convert(TariffDtoWithoutId tariffDtoWithoutId);

    @Named(value = "convertToDto")
    TariffDto convertToDto(Tariff tariff);

    @Named(value = "convertToDtoWithId")
    TariffDtoWithId convertToDtoWithId(Tariff tariff);

    TariffPhoneDto convertToDtoWithPhone(Tariff tariff);

    TariffDtoWithoutId convertToDtoWithoutId(Tariff tariff);

    @IterableMapping(qualifiedByName = "convertToDto")
    List<TariffDto> convertToDtoList(List<Tariff> tariffList);

    @IterableMapping(qualifiedByName = "convertToDtoWithId")
    List<TariffDtoWithId> convertToDtoWithIdList(List<Tariff> tariffList);

    @AfterMapping
    default void linkPhone(@MappingTarget Tariff tariff) {
        if (tariff != null && tariff.getPhoneList() != null) {
            tariff.getPhoneList().forEach(phone -> phone.setTariff(tariff));
        }
    }

}
