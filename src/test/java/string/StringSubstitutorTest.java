package string;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class StringSubstitutorTest {

    @Test
    public void stringFormatTest() {
        String formatValue = "select * from dict.dict_values_get(null::${table_name}, ${date_one}, ${date_two})";
        Map<String, String> values = new HashMap<>();
        values.put("table_name", "dict.dict_values_get");
        values.put("date_one", "1997-02-27");
        values.put("date_two", "1997-02-28");

        String result = StringSubstitutor.builder()
                .build()
                .format(formatValue, values);
        String expected = "select * from dict.dict_values_get(null::dict.dict_values_get, 1997-02-27, 1997-02-28)";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void stringFormatWithChangedDefaultValueTest() {
        String formatValue = "select * from dict.dict_values_get(null::${table_name}, ${date_one}, ${date_two})";
        Map<String, String> values = new HashMap<>();
        values.put("table_name", "dict.dict_values_get");

        String result = StringSubstitutor.builder()
                .defaultValueForEmpty("default_changed")
                .build()
                .format(formatValue, values);
        String expected = "select * from dict.dict_values_get(null::dict.dict_values_get, default_changed, default_changed)";
        assertThat(result).isEqualTo(expected);
    }

}
