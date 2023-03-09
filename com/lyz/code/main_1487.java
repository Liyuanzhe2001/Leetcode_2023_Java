package com.lyz.code;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;

public class main_1487 {

    public static void main(String[] args) {

        NameAndNo tmp = new main_1487().getNameAndNo("pes(2019)");
        System.out.println(tmp.name);
        System.out.println(tmp.no);

    }

    class File {
        int index;
        boolean[] numbers = new boolean[(int) 5E4];
    }

    class NameAndNo {
        String name;
        int no;
    }

    public String[] getFolderNames(String[] names) {
        Map<String, File> map = new HashMap<>();
        String[] res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int no = 0;

            NameAndNo nameAndNo = getNameAndNo(name);

            if (nameAndNo != null) {
                name = nameAndNo.name;
                no = nameAndNo.no;
            }

            File file = map.get(name);
            // 若名字未被使用
            if (file == null) {
                res[i] = name;
                File tmpFile = new File();
                tmpFile.index = 0;
                tmpFile.numbers[0] = true;
                map.put(name, tmpFile);
            } else {
                int index = file.index + 1;
                boolean[] numbers = file.numbers;
                while (numbers[index]) {
                    index++;
                }

                String realName;
                realName = name + "(" + index + ")";
                res[i] = realName;
                file.index++;
                file.numbers[index] = true;

                File tmpFile = new File();
                tmpFile.index = 0;
                tmpFile.numbers[0] = true;
                map.put(realName, tmpFile);
            }

            // 截取后名字处理
            i++;
        }

        return res;
    }

    public NameAndNo getNameAndNo(String name) {
        if (name.charAt(name.length() - 1) != ')') {
            return null;
        }
        if (name.contains("(")) {
            String no = "";
            NameAndNo res = new NameAndNo();
            for (int i = name.length() - 2; i > 0; i--) {
                char c = name.charAt(i);
                if (c == '(') {
                    res.name = name.substring(0, i);
                    res.no = Integer.parseInt(no);
                    return res;
                }
                no = c + no;
            }
        }
        return null;
    }


}
