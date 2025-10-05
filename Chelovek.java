package p;

public class Chelovek {
    String personalName;  // Личное имя
    String patronymic;    // Отчество
    String surname;       // Фамилия
    Chelovek parent;      // Родитель в иерархии

    Chelovek(String personalName, String patronymic, String surname, Chelovek parent) {
        this.personalName = personalName;
        this.patronymic = patronymic;
        this.surname = surname;
        this.parent = parent;
    }

    String getSurnameRecursive() {
        if (surname != null && !surname.isEmpty()) {
            return surname;
        }
        if (parent != null) {
            return parent.getSurnameRecursive();
        }
        return null;
    }

    @Override
    public String toString() {
        String s = getSurnameRecursive();
        if (s == null) s = "(фамилия не задана)";
        return s + " " + personalName + " " + patronymic;
    }
}

