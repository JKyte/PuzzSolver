package core;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMatcher {

    private String start;
    private String end;

    private final String ALGORITHM = "MD5";
    private MessageDigest md;


    public HashMatcher(String start, String end) {
        this.start = start;
        this.end = end;
        initMessageDigest();
    }

    private void initMessageDigest() {
        try {
            md = MessageDigest.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    public String hash(String candidate) {
        md.update(candidate.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest);
    }

    public boolean hashMatches(String hash) {
        return hash.startsWith(start) && hash.endsWith(end);
    }
}
