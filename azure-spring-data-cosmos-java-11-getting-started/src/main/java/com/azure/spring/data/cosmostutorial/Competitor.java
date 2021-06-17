// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmostutorial;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "Competitor-Shopper", ru = "400")
public class Competitor {
    private String id;
    private String country;
    private String name;

    @PartitionKey
    private String store;

    public Competitor() {}

    public Competitor(String id, String name, String country, String store) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.store = store;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
