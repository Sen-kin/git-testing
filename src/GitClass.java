public class GitClass {
    private static Integer newInt = 0;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static Integer getNewInt() {
        return newInt;
    }

    public static void setNewInt(Integer newInt) {
        GitClass.newInt = newInt;
    }
}
