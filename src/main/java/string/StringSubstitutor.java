package string;

import lombok.Builder;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Builder
public class StringSubstitutor {

    private static final String valueStart = "\\$\\{";
    private static final String valueEnd = "\\}";
    private static final String regex = valueStart + "([^}]+)" + valueEnd;

    @Builder.Default
    private final String defaultValueForEmpty = "null";

    public String format(String format, Map<String, String> values) {
        Matcher matcher = Pattern.compile(regex).matcher(format);
        String result = format;
        while (matcher.find()) {
            String[] found = matcher.group(1).split("\\.");
            String value = values.get(found[0]);
            if (value == null) value = defaultValueForEmpty;
            result = result.replaceFirst(regex, value);
        }
        return result;
    }

}
