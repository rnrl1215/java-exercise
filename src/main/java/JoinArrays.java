import java.lang.reflect.Array;
import java.util.Arrays;

public class JoinArrays {

    public String[] joinArrays(String[]... arrays) {
        int len = 0;
        for(String[]array : arrays) {
            len += array.length;
        }

        // 동적 객체 생성
        String []result = (String[]) Array.newInstance(String.class, len);

        // list 로 변환
        int offset = 0;
        for (String[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        System.out.println("TEST: "+Arrays.asList(result));
        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"I","Love"};
        String[] arr2 = {"You"};

        JoinArrays joinArraysInstance = new JoinArrays();
        String[] result = joinArraysInstance.joinArrays(arr1, arr2);
        System.out.println(Arrays.asList(result));
    }
}

