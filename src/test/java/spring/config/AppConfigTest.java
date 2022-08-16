package spring.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.*;

@Configuration
@Profile("test")
@EnableAspectJAutoProxy
@EnableCaching
@ComponentScan(value = {"spring.config", "spring.service"},
        excludeFilters =
        @ComponentScan.Filter(type = FilterType.REGEX,
                pattern = "spring\\.service\\.beanfactory\\..*"))
public class AppConfigTest {

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager();
    }

}
