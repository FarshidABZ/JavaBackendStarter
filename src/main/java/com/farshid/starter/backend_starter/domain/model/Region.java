package com.farshid.starter.backend_starter.domain.model;

public enum Region {
    Central_Coast("Central Coast"), Shouthern_California("Southern California"), Northern_California("Northern California"), Varies("Varies");

    private String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String label) {
        for (Region r : Region.values()) {
            if (r.label.equals(label)) {
                return r;
            }
        }
        return null;
    }
}
