package Homework5556;

import java.util.ArrayList;
import java.util.List;

// Создание собственного исключения
class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(String message) {
        super(message);
    }
}


