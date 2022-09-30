package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconverter.converter
 * fileName       : IntegerToStringConverter
 * author         : kanghyun Kim
 * date           : 2022/09/30
 * description    : docs > https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#core-convert
 *                  1. Converter 기본 타입 컨버터
 *                  2. ConverterFactory 전체 클래스 계층 구조가 필요할 때
 *                  3. GenericConverter 정교한 구현, 대상 필드의 애노테이션 정보 사용 가능
 *                  4. ConditionalGenericConverter 특정 조건이 참인 경우에만 실행
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/30        kanghyun Kim      최초 생성
 */
@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String> {
    @Override
    public String convert(Integer source) {
        log.info("convert Integer to String = {} ", source);
        return String.valueOf(source);
    }
}
