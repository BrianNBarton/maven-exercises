import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class guavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        System.out.println(num);
        double butInt = 7;

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));
        System.out.println(butInt);

        int laregeNum = Integer.MAX_VALUE;
        System.out.println(laregeNum + 1);
       // System.out.println(IntMath.checkedAdd(laregeNum, 1));

        String nameTag = "Hello,,,,,,, my good sir";
     ArrayList<String> cutUpTag = new ArrayList<>();
             Splitter.on(",").trimResults().omitEmptyStrings().split(nameTag).forEach(cutUpTag::add);
        System.out.println(cutUpTag.size());


        for (int i = 0; i < cutUpTag.size(); i++) {
            System.out.println(cutUpTag.get(i));

        }
    }
}