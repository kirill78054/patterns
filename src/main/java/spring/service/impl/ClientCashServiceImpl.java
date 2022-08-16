package spring.service.impl;

import lombok.Getter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import spring.service.ClientCashService;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientCashServiceImpl implements ClientCashService {

    private final List<String> names;

    @Getter
    private int count;

    public ClientCashServiceImpl() {
        this.names = new ArrayList<>();
        names.add("Kirill");
        names.add("Ivan");
    }

    @Override
    @Cacheable("nameCash")
    public String getNameAndCountPlus(int id) {
        System.out.println("Metod `getNameAndCountPlus` get id " + id + ", count++");
        count++;
        return names.get(id);
    }

}
