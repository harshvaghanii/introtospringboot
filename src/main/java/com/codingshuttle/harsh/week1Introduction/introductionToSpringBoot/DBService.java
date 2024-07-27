package com.codingshuttle.harsh.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    DB db;

    public DBService(DB db) {
        this.db = db;
    }

    String getData() {
        return db.getData();
    }
}
