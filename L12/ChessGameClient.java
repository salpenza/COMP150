public class ChessGameClient {
    public static void main(String[] args) {
        String[] boards = {
            "2r1brk1/1p5p/p1nQ3P/2N2pq1/3P4/2P2p2/P4PP1/2R1R1K1 w -",
            "2r1brk1/1p5p/p1nQ3P/2N2pq1/3P4/2P2p2/P4PP1/2R1R1K1 w",
            "2r1brk1/1p5p/p1nQ3P/2N2pq1/3P4/2P2p2/P4PP1/2R1R1K1 k - -",
            "2r1brk1/1p5p/p1nQ3P/2N2pq1/3P4/2P2p2/P4PP1/2R1R1K1 w - k3",
            "2r1brk1/1p5p/p1nQ3P/2N2pq1/3P4/2P2p2/P4PP1/2R1R1K1 w - a9",
            "2r1brk1/1p5p/p1nQ3P/2N2pq1/3P4/2P2p2/P4PP1/2R1R1K1 w - -",
            "r2q1rk1/5pbp/2n1p1p1/p7/Pp1PpB2/1NP4P/1P3PP1/R2Q1RK1 b - -",
            "rnbqkbnr/pppppppp/8/8/3P4/8/PPP1PPPP/RNBQKBNR b KQkq d3"};

        System.out.println("-----------------------------");
        for (String b : boards) {
            System.out.println(b);
            try {
                ChessGame cg = new ChessGame(b);
                cg.printBoard();
            } catch (InvalidFenException ife) {
                System.err.println(ife.getMessage());
            }
            System.out.println("-----------------------------");
        }
    }
}