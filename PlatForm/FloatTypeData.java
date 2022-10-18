

public class FloatTypeData extends SpecificTypeData<Float>{
    public FloatTypeData(float nextFloat) {
        super(nextFloat);
    }

    public void addData(Float data) {
        this.data+=data;
    }
}
