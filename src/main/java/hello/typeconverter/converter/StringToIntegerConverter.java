package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : StringToIntegerConverter
 * author         : kanghyun Kim
 * date           : 2022/09/30
 * description    : docs > <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#core-convert">...</a>
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/30        kanghyun Kim      최초 생성
 */
@Slf4j
public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        log.info("convert String to Integer = {}", source);
        return Integer.valueOf(source);
    }
}
