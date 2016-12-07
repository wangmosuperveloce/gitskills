package morphia;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class City {

    private String id;

    private String name;

    Map<String, String> insList;

    Map<String, String> hfList;
}