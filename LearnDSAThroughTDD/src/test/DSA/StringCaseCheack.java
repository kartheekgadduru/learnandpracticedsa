package test.DSA;

public class StringCaseCheack {
    public boolean isUpperCase(String value) {
        return value.chars().allMatch(Character::isUpperCase);
    }

    public boolean isLowerCase(String value) {
        return value.chars().allMatch(Character::isLowerCase);
    }

    public boolean isPassword(String password) {
        return password.length() > 5 ? password.chars().anyMatch(Character::isLowerCase) &&
                password.chars().anyMatch(Character::isUpperCase) &&
                password.chars().anyMatch(Character::isDigit) : false;

    }


}
