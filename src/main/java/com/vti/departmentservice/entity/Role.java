package com.vti.departmentservice.entity;

public enum Role {
    USER,
    ADMIN,
    MANAGER;

    public static Role toEnum(String role) {
        for(Role item : Role.values()) {
            System.out.println("Role item: " + item.toString());
            if (item.toString().equals(role)) return item;
        }
        return null;
    }
}
