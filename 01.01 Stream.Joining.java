 String[] strArr = {"ab", "Cd", "eF"};
        String stud = Arrays.stream(strArr).collect(joining());
        System.out.println(stud);
