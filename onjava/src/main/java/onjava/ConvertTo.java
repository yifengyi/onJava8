package onjava;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public interface ConvertTo {
    static boolean[] primitive(Boolean[] in){
        boolean[] res = new boolean[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }
    static char[] primitive(Character[] in){
        char[] res = new char[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }
    static byte[] primitive(Byte[] in){
        byte[] res = new byte[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }

    static short[] primitive(Short[] in){
        short[] res = new short[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }
    static int[] primitive(Integer[] in){
        int[] res = new int[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }
    static long[] primitive(Long[] in){
        long[] res = new long[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }

    static float[] primitive(Float[] in){
        float[] res = new float[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }

    static double[] primitive(Double[] in){
        double[] res = new double[in.length];

        for (int i = 0; i < in.length; i++) {
            res[i] = in[i];
        }
        return res;
    }
    static Boolean[] boxed(boolean[] in) {
        Boolean[] result = new Boolean[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i]; // Autoboxing
        return result;
    }

    static Character[] boxed(char[] in) {
        Character[] result = new Character[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    static Byte[] boxed(byte[] in) {
        Byte[] result = new Byte[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    static Short[] boxed(short[] in) {
        Short[] result = new Short[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    static Integer[] boxed(int[] in) {
        Integer[] result = new Integer[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    static Long[] boxed(long[] in) {
        Long[] result = new Long[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    static Float[] boxed(float[] in) {
        Float[] result = new Float[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }

    static Double[] boxed(double[] in) {
        Double[] result = new Double[in.length];
        for (int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }
}
