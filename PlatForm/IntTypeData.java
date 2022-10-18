
public class IntTypeData extends SpecificTypeData<Integer> {
    public IntTypeData(int nextInt) {
        super(nextInt);
    }
    public void addData(Integer data) {
        this.data+=data;
    }
}
