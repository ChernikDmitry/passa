package tetris;

public class Main {

    public static void main(String[] args) {
        int visota = 168;
        int sirina = 11;
        int white = (int) (visota * sirina * 0.8);
        int black = visota * sirina - white;
        System.out.println("all=" + visota * sirina);
        System.out.println("white=" + white);
        System.out.println("black=" + black);
        double probability_black = (double) black / (white + black) + 0.15;
        System.out.println("proba=" + probability_black);

        int[][] massive = new int[sirina][visota];
        for (int j = 0; j < visota; j++) {
            for (int i = 0; i < sirina; i++) {
                massive[i][j] = 3;
            }
        }

        int count_white_line = 0;
        double random = 0.0;
        white = 0;
        black = 0;
        for (int j = 0; j < visota; j++) {
            for (int i = 0; i < sirina; i++) {
                count_white_line++;
                if (massive[i][j] == 3) {
                    random = Math.random();
//                    System.out.println(random);
                    if (random <= probability_black) {
                        massive[i][j] = 1;
                        black++;
                        count_white_line = 0;
                        if (i < sirina - 2) {
                            if (massive[i + 2][j] == 3) {
                                massive[i + 2][j] = 0;
                                white++;
                            }
                        }
                        if (i < sirina - 1) {
                            if (massive[i + 1][j] == 3) {
                                massive[i + 1][j] = 0;
                                white++;
                            }
                        }
                        if (j < visota - 2 && Math.random()<0.5) {
                            if (massive[i][j + 2] == 3) {
                                massive[i][j + 2] = 0;
                                white++;
                            }
                        }
                        if (j < visota - 1) {
                            if (massive[i][j + 1] == 3) {
                                massive[i][j + 1] = 0;
                                white++;
                            }
                        }
                    } else if (count_white_line > (5 + Math.random() * 7)) {
                        massive[i][j] = 1;
                        black++;
                        count_white_line = 0;
                        if (i < sirina - 1) {
                            if (massive[i + 1][j] == 3) {
                                massive[i + 1][j] = 0;
                                white++;
                            }
                        }
                        if (j < visota - 1) {
                            if (massive[i][j + 1] == 3) {
                                massive[i][j + 1] = 0;
                                white++;
                            }
                        }
                    } else {
                        massive[i][j] = 0;
                        white++;
                    }
                }
            }
        }

        for (int j = 0; j < visota; j++) {
            for (int i = 0; i < sirina; i++) {
                System.out.print(massive[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("all=" + (white + black));
        System.out.println("white=" + white);
        System.out.println("black=" + black);


        for (int j = 0; j < visota; j++) {
            for (int i = 0; i < sirina; i++) {
                massive[i][j] = 3;
            }
        }


        count_white_line = 0;
        random = 0.0;
        white = 0;
        black = 0;
        for (int i = 0; i < sirina; i++) {
            for (int j = 0; j < visota; j++) {
                count_white_line++;
                if (massive[i][j] == 3) {
                    random = Math.random();
//                    System.out.println(random);
                    if (random <= probability_black) {
                        massive[i][j] = 1;
                        black++;
                        count_white_line = 0;
                        if (i < sirina - 2) {
                            if (massive[i + 2][j] == 3) {
                                massive[i + 2][j] = 0;
                                white++;
                            }
                        }
                        if (i < sirina - 1) {
                            if (massive[i + 1][j] == 3) {
                                massive[i + 1][j] = 0;
                                white++;
                            }
                        }
                        if (j < visota - 2 && Math.random()<0.5) {
                            if (massive[i][j + 2] == 3) {
                                massive[i][j + 2] = 0;
                                white++;
                            }
                        }
                        if (j < visota - 1) {
                            if (massive[i][j + 1] == 3) {
                                massive[i][j + 1] = 0;
                                white++;
                            }
                        }
                    } else if (count_white_line > (5 + Math.random() * 7)) {
                        massive[i][j] = 1;
                        black++;
                        count_white_line = 0;
                        if (i < sirina - 1) {
                            if (massive[i + 1][j] == 3) {
                                massive[i + 1][j] = 0;
                                white++;
                            }
                        }
                        if (j < visota - 1) {
                            if (massive[i][j + 1] == 3) {
                                massive[i][j + 1] = 0;
                                white++;
                            }
                        }
                    } else {
                        massive[i][j] = 0;
                        white++;
                    }
                }
            }
        }

        for (int j = 0; j < visota; j++) {
            for (int i = 0; i < sirina; i++) {
                System.out.print(massive[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("all=" + (white + black));
        System.out.println("white=" + white);
        System.out.println("black=" + black);
    }

}
