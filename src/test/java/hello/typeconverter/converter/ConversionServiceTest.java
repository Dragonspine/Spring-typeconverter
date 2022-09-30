package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : ConversionServiceTest
 * author         : kanghyun Kim
 * date           : 2022/09/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/30        kanghyun Kim      최초 생성
 */
public class ConversionServiceTest {

    @Test
    void conversionService() {
        //등록
        DefaultConversionService cs = new DefaultConversionService();
        cs.addConverter(new StringToIntegerConverter());
        cs.addConverter(new IntegerToStringConverter());
        cs.addConverter(new StringToIpPortConverter());
        cs.addConverter(new IpPortToStringConverter());

        //사용
        assertThat(cs.convert("10", Integer.class)).isEqualTo(10);
        assertThat(cs.convert(10, String.class)).isEqualTo("10");
        assertThat(cs.convert("127.0.0.1:8080", IpPort.class)).isEqualTo(new IpPort("127.0.0.1", 8080));
        assertThat(cs.convert(new IpPort("127.0.0.1", 8080), String.class)).isEqualTo("127.0.0.1:8080");
    }
}
