package com.pbo1;

import java.util.Scanner;

public class Event {
    Player player = new Player();
    Scanner scanner = new Scanner(System.in);
    public void GamePlay(){
//        Scanner scanner = new Scanner(System.in);
        System.out.println("<=====================[intro]====================>");
        System.out.println("hai siapa namamu?");
        String nama = scanner.nextLine();
        player.setName(nama);
        System.out.println("hai "+player.getName());
        System.out.println("ini adalah statusmu"+"\n"+"HP = "+player.health+"\n"+"mana = "+player.mana+"\n"+"attack = "
                +player.attack+"\n"+"Stamina = "+player.stamina);
        System.out.println("apakah kamu sudah siap memulai pertualanganmu?");
        System.out.println("pilihan"+"\n"+"1. ya"+"\n"+"2. tidak"+"\n"+"pilih angka 1 atau 2");
        int Pilihan = scanner.nextInt();
        if (Pilihan == 1){
            tutorial();
        }
        else{
            System.out.println("kamu dibunuh oleh Game Master"+"\n"+"Game Over");
        }
    }
    public void tutorial(){
        System.out.println("<=================[Tutorial Stage]================>>");
        System.out.println("kamu sedang berjalan menuju desa Penari"+"\n"+
                "saat dalam perjalanan kamu melihat warga desa diserang beberapa bandit");
        System.out.println("<===============[Battle]=============>");
        System.out.println("Tutorial = ketika kamu menyerang staminamu akan berkurang 5 poin, saat kamu memilih standby," +
                " staminamu akan bertambah 7"+"\n"+"dan jika kamu memilih bertahan, staminamu akan bertambah 2 dan damage yang " +
                " kamu terima dikurangi 5");
        boolean Enemy = true;
        Enemy enemy = new Enemy();
        System.out.println(player.getName()+" 2 bandit menghampirimu bersiaplah");
        System.out.println("status enemy"+"\n"+"HP = "+enemy.health+"\n"+"mana = "+enemy.mana+"\n"+
                "attack = "+enemy.attack);
        while (Enemy == true){
            System.out.println("pilihan"+"\n"+"1. serang"+"\n"+"2. bertahan"+"\n"+"3. standby"+"\n"+"4. kabur");
            int pilihan = scanner.nextInt();
            if(pilihan == 1){
                System.out.println("kamu menyerang musuh");
                enemy.health = enemy.health - player.attack;
                player.stamina = player.stamina - 5;
                System.out.println(enemy.health);
            }
            else{
                break;
            }
        }
    }
}
