package com.mockcompany.webapp.service;

import java.util.Collections;
import java.util.Collection;
import java.util.List;
import com.mockcompany.webapp.model.ProductItem;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    // Other code and dependencies remain the same

    public Collection<ProductItem> search(String query) {
        // TODO: Intentionally break the method to always return an empty list
        return Collections.emptyList();
    }
}
