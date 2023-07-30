package com.lyz.code.周赛356;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2023年07月30日 10:23
 * @description
 */

public class Main_03 {
    public String minimumString(String a, String b, String c) {
        List<String> list = new ArrayList<>();
        String ab = a;
        if (a.contains(b)) {
            ab = a;
        } else if (b.contains(a)) {
            ab = b;
        } else {
            for (int i = b.length(); i >= 0; i--) {
                String prefix = b.substring(0, i);
                if (ab.endsWith(prefix)) {
                    ab = ab + b.substring(i);
                    break;
                }
            }
        }

        String bc = b;
        if (b.contains(c)) {
            bc = b;
        } else if (c.contains(b)) {
            bc = c;
        } else {
            for (int i = c.length(); i >= 0; i--) {
                String prefix = c.substring(0, i);
                if (bc.endsWith(prefix)) {
                    bc = bc + c.substring(i);
                    break;
                }
            }
        }

        String ac = a;
        if (a.contains(c)) {
            ac = a;
        } else if (c.contains(a)) {
            ac = c;
        } else {
            for (int i = c.length(); i >= 0; i--) {
                String prefix = c.substring(0, i);
                if (ac.endsWith(prefix)) {
                    ac = ac + c.substring(i);
                    break;
                }
            }
        }

        String abc = ab;
        if (ab.contains(c)) {
            abc = ab;
        } else if (c.contains(ab)) {
            abc = c;
        } else {
            for (int i = c.length(); i >= 0; i--) {
                String prefix = c.substring(0, i);
                if (abc.endsWith(prefix)) {
                    abc = abc + c.substring(i);
                    break;
                }
            }
        }

        String acb = ac;
        if (ac.contains(b)) {
            acb = ac;
        } else if (b.contains(ac)) {
            acb = b;
        } else {
            for (int i = b.length(); i >= 0; i--) {
                String prefix = b.substring(0, i);
                if (acb.endsWith(prefix)) {
                    acb = acb + b.substring(i);
                    break;
                }
            }
        }

        String bac = b;
        if (b.contains(ac)) {
            bac = b;
        } else if (ac.contains(b)) {
            bac = ac;
        } else {
            for (int i = ac.length(); i >= 0; i--) {
                String prefix = ac.substring(0, i);
                if (bac.endsWith(prefix)) {
                    bac = bac + ac.substring(i);
                    break;
                }
            }
        }

        String bca = bc;
        if (bc.contains(a)) {
            bca = bc;
        } else if (a.contains(bc)) {
            bca = a;
        } else {
            for (int i = a.length(); i >= 0; i--) {
                String prefix = a.substring(0, i);
                if (bca.endsWith(prefix)) {
                    bca = bca + a.substring(i);
                    break;
                }
            }
        }

        String cab = c;
        if (c.contains(ab)) {
            cab = c;
        } else if (ab.contains(c)) {
            cab = ab;
        } else {
            for (int i = ab.length(); i >= 0; i--) {
                String prefix = ab.substring(0, i);
                if (cab.endsWith(prefix)) {
                    cab = cab + ab.substring(i);
                    break;
                }
            }
        }

        String cb = c;
        if (c.contains(b)) {
            cb = c;
        } else if (b.contains(c)) {
            cb = b;
        } else {
            for (int i = b.length(); i >= 0; i--) {
                String prefix = b.substring(0, i);
                if (cb.endsWith(prefix)) {
                    cb = cb + b.substring(i);
                    break;
                }
            }
        }
        System.out.println(cb);

        String cba = cb;
        if (cb.contains(a)) {
            cba = cb;
        } else if (a.contains(cb)) {
            cba = a;
        } else {
            for (int i = a.length(); i >= 0; i--) {
                String prefix = a.substring(0, i);
                if (cba.endsWith(prefix)) {
                    cba = cba + a.substring(i);
                    break;
                }
            }
        }

        list.add(abc);
        list.add(acb);
        list.add(bac);
        list.add(bca);
        list.add(cab);
        list.add(cba);
        System.out.println(list);
        list.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        return list.get(0);
    }
}

/*
"abc"
"bca"
"aaa"
"ab"
"ba"
"aba"
"ca"
"a"
"a"
"a"
"a"
"b"
"c"
"a"
"bc"
 */
