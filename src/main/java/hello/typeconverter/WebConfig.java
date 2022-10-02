package hello.typeconverter;

import hello.typeconverter.converter.IntegerToStringConverter;
import hello.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.converter.StringToIntegerConverter;
import hello.typeconverter.converter.StringToIpPortConverter;
import hello.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName    : hello.typeconverter
 * fileName       : WebConfig
 * author         : kanghyun Kim
 * date           : 2022/09/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/09/30        kanghyun Kim      최초 생성
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * WebConfig - 컨버터, 포멧터 등록
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 포멧터보다 컨버터가 우선순위가 높다 (포멧터 parse(문자>숫자), format(숫자>문자)라서 적용안됨)
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());

        // 컨버터
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        // 포멧터
        registry.addFormatter(new MyNumberFormatter());
    }


}
