//package by.step.test.mapper;
//
//import by.step.dto.tariffDto.TariffDto;
//import by.step.dto.tariffDto.TariffDtoWithId;
//import by.step.dto.tariffDto.TariffPhoneDto;
//import by.step.entity.Phone;
//import by.step.entity.Tariff;
//import by.step.mapper.TariffMapper;
//import by.step.mapper.TariffMapperImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.DisplayName;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//
//public class TariffMapperTest {
//
//    private final TariffMapper tariffMapper = new TariffMapperImpl();
//
//    private Tariff tariff = new Tariff();
//    private TariffDto tariffDto;
//    private TariffDtoWithId tariffDtoWithId;
//    private TariffPhoneDto tariffPhoneDto;
//
//    @Before
//    public void setTariff() {
//        tariff.setId(1L);
//        tariff.setName("Tariff");
//        tariff.setMinutes(500);
//        tariff.setMegabytes(100000);
//        tariff.setDateCreation(new Date());
//        List<Phone> phoneList = new ArrayList<>();
//        Collections.addAll(phoneList, new Phone(), new Phone());
//        tariff.setPhoneList(phoneList);
//    }
//
//    @Test
//    @DisplayName("Convert Tariff to TariffDto")
//    public void convertToTariffDtoTest() {
//        tariffDto = tariffMapper.convertToDto(tariff);
//        assertThat(tariff.getName()).isEqualTo(tariffDto.getName());
//        assertThat(tariff.getMinutes()).isEqualTo(tariffDto.getMinutes());
//        assertThat(tariff.getMegabytes()).isEqualTo(tariffDto.getMegabytes());
//    }
//
//    @Test
//    @DisplayName("Convert Tariff to TariffDtoWithId")
//    public void convertToTariffDtoWithIdTest() {
//        tariffDtoWithId = tariffMapper.convertToDtoWithId(tariff);
//        assertThat(tariff.getName()).isEqualTo(tariffDtoWithId.getName());
//        assertThat(tariff.getMinutes()).isEqualTo(tariffDtoWithId.getMinutes());
//        assertThat(tariff.getMegabytes()).isEqualTo(tariffDtoWithId.getMegabytes());
//        assertThat(tariff.getId()).isEqualTo(tariffDtoWithId.getId());
//        assertThat(new SimpleDateFormat().format(tariff.getDateCreation())).isEqualTo(tariffDtoWithId.getDateCreation());
//    }
//
//    @Test
//    @DisplayName("Convert Tariff to TariffPhoneDto")
//    public void convertToTariffPhoneDtoTest() {
//        tariffPhoneDto = tariffMapper.convertToDtoWithPhone(tariff);
//        assertThat(tariff.getName()).isEqualTo(tariffPhoneDto.getName());
//        assertThat(tariff.getMinutes()).isEqualTo(tariffPhoneDto.getMinutes());
//        assertThat(tariff.getMegabytes()).isEqualTo(tariffPhoneDto.getMegabytes());
//        assertThat(tariff.getId()).isEqualTo(tariffPhoneDto.getId());
//        assertThat(new SimpleDateFormat().format(tariff.getDateCreation())).isEqualTo(tariffPhoneDto.getDateCreation());
//        assertThat(tariffPhoneDto.getPhoneList()).isNotNull();
//    }
//
//    @Test
//    @DisplayName("Convert from TariffDto to Tariff")
//    public void convertFromTariffDtoTest() {
//        tariffDto = tariffMapper.convertToDto(tariff);
//        tariff = tariffMapper.convert(tariffDto);
//        assertThat(tariffDto.getName()).isEqualTo(tariff.getName());
//        assertThat(tariffDto.getMinutes()).isEqualTo(tariff.getMinutes());
//        assertThat(tariffDto.getMegabytes()).isEqualTo(tariff.getMegabytes());
//    }
//
//    @Test
//    @DisplayName("Convert from TariffDtoWithId to Tariff")
//    public void convertFromTariffDtoWithIdTest() {
//        tariffDtoWithId = tariffMapper.convertToDtoWithId(tariff);
//        tariff = tariffMapper.convert(tariffDtoWithId);
//        assertThat(tariffDtoWithId.getName()).isEqualTo(tariff.getName());
//        assertThat(tariffDtoWithId.getMinutes()).isEqualTo(tariff.getMinutes());
//        assertThat(tariffDtoWithId.getMegabytes()).isEqualTo(tariff.getMegabytes());
//        assertThat(tariffDtoWithId.getId()).isEqualTo(tariff.getId());
//        assertThat(tariffDtoWithId.getDateCreation()).isEqualTo(new SimpleDateFormat().format(tariff.getDateCreation()));
//    }
//
//    @Test
//    @DisplayName("Convert from TariffPhoneDto to Tariff")
//    public void convertFromTariffPhoneDtoTest() {
//        tariffPhoneDto = tariffMapper.convertToDtoWithPhone(tariff);
//        tariff = tariffMapper.convert(tariffPhoneDto);
//        assertThat(tariffPhoneDto.getName()).isEqualTo(tariff.getName());
//        assertThat(tariffPhoneDto.getMinutes()).isEqualTo(tariff.getMinutes());
//        assertThat(tariffPhoneDto.getMegabytes()).isEqualTo(tariff.getMegabytes());
//        assertThat(tariffPhoneDto.getId()).isEqualTo(tariff.getId());
//        assertThat(tariffPhoneDto.getDateCreation()).isEqualTo(new SimpleDateFormat().format(tariff.getDateCreation()));
//        assertThat(tariff.getPhoneList()).isNotNull();
//    }
//
//}
