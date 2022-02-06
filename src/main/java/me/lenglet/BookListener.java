package me.lenglet;

import javax.persistence.PreUpdate;

public class BookListener {

    @PreUpdate
    private void beforeAnyUpdate(Book book) {
        Dependencies.INSTANCE.get().doSomething();
    }

    public enum Dependencies {

        INSTANCE;

        private Service service;

        public void set(Service service) {
            this.service = service;
        }

        public Service get() {
            return this.service;
        }

    }
}
