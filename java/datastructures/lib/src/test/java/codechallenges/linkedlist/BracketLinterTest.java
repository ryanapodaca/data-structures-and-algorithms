package codechallenges.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketLinterTest {

  @Test void testBracketLinter(){
    String accurate = "{[]}";
    String wrong = "{[]";
    String edgeCase = "{[{";
    //assertTrue(BracketLinter.bracketLinter(accurate));
    assertFalse(BracketLinter.bracketLinter(wrong));
    assertFalse(BracketLinter.bracketLinter(edgeCase));

  }

}
