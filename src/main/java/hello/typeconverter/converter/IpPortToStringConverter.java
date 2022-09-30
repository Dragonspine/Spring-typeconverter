package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : IpPortToStringConverter
 * author         : kanghyun Kim
 * date           : 2022/09/30
 * description    : docs > <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#core-convert">...</a>
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/30        kanghyun Kim      최초 생성
 */
@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {
    @Override
    public String convert(IpPort source) {
        log.info("convert IpPort to String  = {} ", source);
        return source.getIp() + ":" + source.getPort();
    }
}
