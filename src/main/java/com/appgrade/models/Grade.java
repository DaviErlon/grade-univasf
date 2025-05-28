package com.appgrade.models;

import java.util.*;

public abstract class Grade {

    protected Map<Integer, Set<String>> periodo;

    protected Map<String, Set<String>> prerrequisitos;

    protected Map<String, Set<String>> requisitoDe;
}
