//package by.step.test.mapper;
//
//import by.step.dto.clientDto.ClientDto;
//import by.step.dto.clientDto.ClientDtoWithId;
//import by.step.dto.clientDto.ClientDtoWithoutId;
//import by.step.dto.clientDto.ClientPhoneDto;
//import by.step.entity.Client;
//import by.step.entity.Phone;
//import by.step.mapper.ClientMapper;
//import by.step.mapper.ClientMapperImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.DisplayName;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class ClientMapperTest {
//
//    private final ClientMapper clientMapper = new ClientMapperImpl();
//
//    private Client client = new Client();
//    private ClientDto clientDto;
//    private ClientDtoWithId clientDtoWithId;
//    private ClientPhoneDto clientPhoneDto;
//    private ClientDtoWithoutId clientDtoWithoutId;
//
//    @Before
//    public void setClient() {
//        client.setId(1L);
//        client.setName("Name");
//        client.setLastName("LastName");
//        client.setPatronymic("Patronymic");
//        client.setDateCreation(new Date());
//        Phone firstPhone = new Phone();
//        Phone secondPhone = new Phone();
//        List<Phone> phoneList = new ArrayList<>();
//        Collections.addAll(phoneList, firstPhone, secondPhone);
//        client.setPhoneList(phoneList);
//    }
//
//    @Test
//    @DisplayName("Convert Client to ClientDto Test")
//    public void convertToClientDtoTest() {
//        clientDto = clientMapper.convertToDto(client);
//        assertThat(client.getName()).isEqualTo(clientDto.getName());
//        assertThat(client.getLastName()).isEqualTo(clientDto.getLastName());
//        assertThat(client.getPatronymic()).isEqualTo(clientDto.getPatronymic());
//    }
//
//    @Test
//    @DisplayName("Convert Client to ClientDtoWithId Test")
//    public void convertToClientDtoWithIdTest() {
//        clientDtoWithId = clientMapper.convertToDtoWithId(client);
//        assertThat(client.getName()).isEqualTo(clientDtoWithId.getName());
//        assertThat(client.getLastName()).isEqualTo(clientDtoWithId.getLastName());
//        assertThat(client.getPatronymic()).isEqualTo(clientDtoWithId.getPatronymic());
//        assertThat(client.getId()).isEqualTo(clientDtoWithId.getId());
//        assertThat(new SimpleDateFormat().format(client.getDateCreation())).isEqualTo(clientDtoWithId.getDateCreation());
//    }
//
//    @Test
//    @DisplayName("Convert Client to ClientPhoneDto Test")
//    public void convertToClientPhoneDtoTest() {
//        clientPhoneDto = clientMapper.convertToDtoWithPhone(client);
//        assertThat(client.getName()).isEqualTo(clientPhoneDto.getName());
//        assertThat(client.getLastName()).isEqualTo(clientPhoneDto.getLastName());
//        assertThat(client.getPatronymic()).isEqualTo(clientPhoneDto.getPatronymic());
//        assertThat(client.getId()).isEqualTo(clientPhoneDto.getId());
//        assertThat(new SimpleDateFormat().format(client.getDateCreation())).isEqualTo(clientPhoneDto.getDateCreation());
//        assertThat(client.getPhoneList().size()).isEqualTo(clientPhoneDto.getPhoneList().size());
//    }
//
//    @Test
//    @DisplayName("Convert to Client from ClientDto Test")
//    public void convertToClientFromDtoTest() {
//        clientDto = clientMapper.convertToDto(client);
//        client = clientMapper.convert(clientDto);
//        assertThat(clientDto.getName()).isEqualTo(client.getName());
//        assertThat(clientDto.getLastName()).isEqualTo(client.getLastName());
//        assertThat(clientDto.getPatronymic()).isEqualTo(client.getPatronymic());
//    }
//
//    @Test
//    @DisplayName("Convert to Client from ClientDtoWithId Test")
//    public void convertToClientFromDtoWithIdTest() {
//        clientDtoWithId = clientMapper.convertToDtoWithId(client);
//        client = clientMapper.convert(clientDtoWithId);
//        assertThat(clientDtoWithId.getName()).isEqualTo(client.getName());
//        assertThat(clientDtoWithId.getLastName()).isEqualTo(client.getLastName());
//        assertThat(clientDtoWithId.getPatronymic()).isEqualTo(client.getPatronymic());
//        assertThat(clientDtoWithId.getId()).isEqualTo(client.getId());
//        assertThat(clientDtoWithId.getDateCreation()).isEqualTo(new SimpleDateFormat().format(client.getDateCreation()));
//    }
//
//    @Test
//    @DisplayName("Convert to Client from ClientPhoneDto Test")
//    public void convertToClientFromClientPhoneDtoTest() {
//        clientPhoneDto = clientMapper.convertToDtoWithPhone(client);
//        client = clientMapper.convert(clientPhoneDto);
//        assertThat(clientPhoneDto.getName()).isEqualTo(client.getName());
//        assertThat(clientPhoneDto.getLastName()).isEqualTo(client.getLastName());
//        assertThat(clientPhoneDto.getPatronymic()).isEqualTo(client.getPatronymic());
//        assertThat(clientPhoneDto.getId()).isEqualTo(client.getId());
//        assertThat(clientPhoneDto.getDateCreation()).isEqualTo(new SimpleDateFormat().format(client.getDateCreation()));
//        assertThat(clientPhoneDto.getPhoneList().size()).isEqualTo(client.getPhoneList().size());
//    }
//
//    @Test
//    @DisplayName("Convert Client to ClientDtoWithoutId Test")
//    public void convertToClientDtoWithoutIdTest() {
//        clientDtoWithoutId = clientMapper.convertToDtoWithoutId(client);
//        assertThat(client.getName()).isEqualTo(clientDtoWithoutId.getName());
//        assertThat(client.getLastName()).isEqualTo(clientDtoWithoutId.getLastName());
//        assertThat(client.getPatronymic()).isEqualTo(clientDtoWithoutId.getPatronymic());
//        assertThat(client.getPhoneList().size()).isEqualTo(clientDtoWithoutId.getPhoneList().size());
//    }
//
//    @Test
//    @DisplayName("Convert to Client from ClientDtoWithoutId Test")
//    public void convertToClientFromDtoWithoutIdTest() {
//        clientDtoWithoutId = clientMapper.convertToDtoWithoutId(client);
//        client = clientMapper.convert(clientDtoWithoutId);
//        assertThat(clientDtoWithoutId.getName()).isEqualTo(client.getName());
//        assertThat(clientDtoWithoutId.getLastName()).isEqualTo(client.getLastName());
//        assertThat(clientDtoWithoutId.getPatronymic()).isEqualTo(client.getPatronymic());
//        assertThat(clientDtoWithoutId.getPhoneList().size()).isEqualTo(client.getPhoneList().size());
//    }
//
//}
