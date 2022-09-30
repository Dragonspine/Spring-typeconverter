package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : StringToIpPortConverter
 * author         : kanghyun Kim
 * date           : 2022/09/30
 * description    : docs > <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#core-convert">...</a>
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/30        kanghyun Kim      최초 생성
 */
@Slf4j
public class StringToIpPortConverter implements Converter<String, IpPort> {

    @Override
    public IpPort convert(String source) {
        log.info("convert String to IpPort = {} ", source);
        String[] split = source.split(":");
        String ip = split[0];
        int port = Integer.parseInt(split[1]);
        return new IpPort(ip, port);
    }
}
