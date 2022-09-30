package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : ConverterTest
 * author         : kanghyun Kim
 * date           : 2022/09/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/30        kanghyun Kim      최초 생성
 */
public class ConverterTest {

    @Test
    void StringToInteger() {
        StringToIntegerConverter con = new StringToIntegerConverter();
        Integer result = con.convert("10");
        assertThat(result).isEqualTo(10);
    }

    @Test
    void IntegerToString() {
        IntegerToStringConverter con = new IntegerToStringConverter();
        String result = con.convert(10);
        assertThat(result).isEqualTo("10");
    }

    @Test
    void IpPortToString() {
        IpPortToStringConverter con = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8080);
        String result = con.convert(source);

        assertThat(result).isEqualTo("127.0.0.1:8080");
    }

    @Test
    void StringToIpPort() {
        StringToIpPortConverter con = new StringToIpPortConverter();
        String source = "127.0.0.1:8080";
        IpPort result = con.convert(source);

        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }
}
