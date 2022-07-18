package model;

import java.util.ArrayList;
import java.util.List;

/** Composite */
public class Box implements ComponentItem {

    private List<ComponentItem> components = new ArrayList<>();

    @Override
    public Double calcPrice() {
        return components.stream().mapToDouble(ComponentItem::calcPrice).sum();
    }

    public Box addComponent(ComponentItem product) {
        components.add(product);
        return this;
    }
}
