package com.puppycrawl.tools.checkstyle;

import com.puppycrawl.tools.checkstyle.checks.WhitespaceAroundCheck;

public class WhitespaceAroundTest
    extends BaseCheckTestCase
{
    public void testIt()
        throws Exception
    {
        final CheckConfiguration checkConfig = new CheckConfiguration();
        checkConfig.setClassname(WhitespaceAroundCheck.class.getName());
        final Checker c = createChecker(checkConfig);
        final String fname = getPath("InputWhitespace.java");
        final String[] expected = {
            "16:22: '=' is not preceeded with whitespace.",
            "16:23: '=' is not followed by whitespace.",
            "18:24: '=' is not followed by whitespace.",
            "26:14: '=' is not preceeded with whitespace.",
            "27:10: '=' is not preceeded with whitespace.",
            "27:11: '=' is not followed by whitespace.",
            "28:10: '+=' is not preceeded with whitespace.",
            "28:12: '+=' is not followed by whitespace.",
            "29:13: '-=' is not followed by whitespace.",
            "37:21: 'synchronized' is not followed by whitespace.",
            "39:12: 'try' is not followed by whitespace.",
            "39:12: '{' is not preceeded with whitespace.",
            "41:14: 'catch' is not followed by whitespace.",
            "41:34: '{' is not preceeded with whitespace.",
            "58:11: 'if' is not followed by whitespace.",
            "76:19: 'return' is not followed by whitespace.",
            "97:29: '?' is not preceeded with whitespace.",
            "97:30: '?' is not followed by whitespace.",
            "97:34: ':' is not preceeded with whitespace.",
            "97:35: ':' is not followed by whitespace.",
            "98:15: '==' is not preceeded with whitespace.",
            "98:17: '==' is not followed by whitespace.",
            "104:20: '*' is not followed by whitespace.",
            "104:21: '*' is not preceeded with whitespace.",
            "119:18: '%' is not preceeded with whitespace.",
            "120:20: '%' is not followed by whitespace.",
            "121:18: '%' is not preceeded with whitespace.",
            "121:19: '%' is not followed by whitespace.",
            "123:18: '/' is not preceeded with whitespace.",
            "124:20: '/' is not followed by whitespace.",
            "125:18: '/' is not preceeded with whitespace.",
            "125:19: '/' is not followed by whitespace.",
            "153:15: 'assert' is not followed by whitespace.",
            "156:20: ':' is not preceeded with whitespace.",
            "156:21: ':' is not followed by whitespace.",
        };
        verify(c, fname, expected);
    }

    public void testIt2()
        throws Exception
    {
        final CheckConfiguration checkConfig = new CheckConfiguration();
        checkConfig.setClassname(WhitespaceAroundCheck.class.getName());
        final Checker c = createChecker(checkConfig);
        final String fname = getPath("InputSimple.java");
        final String[] expected = {
            "153:27: '=' is not followed by whitespace.",
            "154:27: '=' is not followed by whitespace.",
            "155:27: '=' is not followed by whitespace.",
            "156:27: '=' is not followed by whitespace.",
            "157:27: '=' is not followed by whitespace.",
            "158:27: '=' is not followed by whitespace.",
        };
        verify(c, fname, expected);
    }

    public void testIt3()
        throws Exception
    {
        final CheckConfiguration checkConfig = new CheckConfiguration();
        checkConfig.setClassname(WhitespaceAroundCheck.class.getName());
        final Checker c = createChecker(checkConfig);
        final String fname = getPath("InputBraces.java");
        final String[] expected = {
            "41:14: 'while' is not followed by whitespace.",
            "58:12: 'for' is not followed by whitespace.",
            // + ":58:23: ';' is not followed by whitespace.",
            //  + ":58:29: ';' is not followed by whitespace.",
        };
        verify(c, fname, expected);
    }
}
