import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="1월 2일", PorkParty=@participate(p1="A", p2="B", p3="C", p4="D"))
class Main {
    public static void main(String args[]) {
        Class<Main> cls = Main.class;

        TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
        System.out.println(anno.testedBy());
        System.out.println("참가자1 : "+anno.PorkParty().p1());
        System.out.println("참가자2 : "+anno.PorkParty().p2());
        System.out.println("참가자3 : "+anno.PorkParty().p3());
        System.out.println("참가자4 : "+anno.PorkParty().p4());

        for(String str : anno.testTools())
            System.out.println("testTools="+str);

        System.out.println();
        Annotation[] annoArr = cls.getAnnotations();
        for(Annotation a : annoArr)
            System.out.println(a);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int       count()	    default 1;
    String    testedBy();
    String[]  testTools()   default "kakaotalk";
    TestType  testType()    default TestType.FIRST;
    participate  PorkParty();
}

@Retention(RetentionPolicy.RUNTIME)
@interface participate {
    String p1();
    String p2();
    String p3();
    String p4();
}

enum TestType { FIRST, FINAL }
