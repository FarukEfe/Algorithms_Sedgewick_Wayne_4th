package S5._5_1;

public final class String implements Comparable<String> {

    private char[] value; // character sequence
    private int offset; // Index of the first character in the array
                        // This comes in handy for getting substrings
    private int length; // length of the sequence (string)
    private int hash; // cache of hashCode()

    public int length() { return this.length; }

    public char charAt(int i) { return this.value[i + this.offset]; }

    private String(int offset, int length, char[] value) {
        this.offset = offset;
        this.length = length;
        this.value = value;
    }

    public String substring(int from, int to) {
        return new String(offset + from, to - from, value);
    }

    @Override
    public int compareTo(String o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
