package ss8.BaiTap;

public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (isSameScore(player1Score, player2Score)) {
            return getEqualScore(player1Score);
        } else if (isEndGame(player1Score, player2Score)) {
            return getEndGameScore(player1Score, player2Score);
        } else {
            return getNormalScore(player1Score, player2Score);
        }
    }

    private static boolean isSameScore(int player1Score, int player2Score) {
        return player1Score == player2Score;
    }

    private static boolean isEndGame(int player1Score, int player2Score) {
        return player1Score >= 4 || player2Score >= 4;
    }

    private static String getEqualScore(int score) {
        return switch (score) {
            case LOVE -> "Love-All";
            case FIFTEEN -> "Fifteen-All";
            case THIRTY -> "Thirty-All";
            case FORTY -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static String getEndGameScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) return "Advantage player1";
        if (scoreDifference == -1) return "Advantage player2";
        if (scoreDifference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return getScoreDescription(player1Score) + "-" + getScoreDescription(player2Score);
    }

    private static String getScoreDescription(int score) {
        return switch (score) {
            case LOVE -> "Love";
            case FIFTEEN -> "Fifteen";
            case THIRTY -> "Thirty";
            case FORTY -> "Forty";
            default -> "Unknown";
        };
    }
}
