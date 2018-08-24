static String abbreviation(String a, String b) {
        boolean[][] dp = new boolean[b.length() + 1][a.length() + 1];
        dp[0][0] = true;
        for (int j = 1; j < dp[0].length; j++) {
            if (Character.isLowerCase(a.charAt(j - 1))) dp[0][j] = dp[0][j - 1];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                char ca = a.charAt(j - 1), cb = b.charAt(i - 1);
                if (ca >= 'A' && ca <= 'Z') {
                    if (ca == cb) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }else {
                    ca = Character.toUpperCase(ca);
                    if (ca == cb) dp[i][j] = dp[i - 1][j - 1] || dp[i][j - 1];
                    else dp[i][j] = dp[i][j - 1];
                }
            }
        }
        
        re