package hello.typeconverter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * packageName    : hello.typeconverter.formatter
 * fileName       : MyNumberFormatter
 * author         : kanghyun Kim
 * date           : 2022/10/02
 * docs           : <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#format">...</a>
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/10/02        kanghyun Kim      최초 생성
 */

@Slf4j
//Number 추상 클래스는 자식으로
//Integer Long Float Double Byte Short 등을 구현체로 가지고있음
public class MyNumberFormatter implements Formatter<Number> {
    @Override
    public Number parse(String text, Locale locale) throws ParseException {
        log.info("text={}, locale={}", text, locale);
        // parse: 문자를 숫자로 변환 (ex. "1,000" -> 1000)
        return NumberFormat.getInstance(locale).parse(text);
    }

    @Override
    public String print(Number object, Locale locale) {
        log.info("obejct={}, locale={}", object, locale);
        // format: 숫자를 문자로 변환 (ex. 1000 -> "1,000")
        return NumberFormat.getInstance(locale).format(object);
    }
}
