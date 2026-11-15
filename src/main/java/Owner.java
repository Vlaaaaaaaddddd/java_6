public record Owner(String firstName, String lastName, int age) implements Comparable<Owner>{
    @Override
    public int compareTo(Owner other) {
        return Integer.compare(this.age, other.age);
    }
}