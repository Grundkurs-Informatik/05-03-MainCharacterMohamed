public void Sort_Klick() {



        loescheAnzeige();


        startZeit = System.nanoTime();





        // z.B. 1000 Durchläufe


        for(int I=0; I<1000; I++){


            boolean sortiert = true;


            karten = new Liste<Karte>(); 


            initialisiereKarten(0);


            do


            {


                sortiert = true;


                for(int i = 1; i < karten.laenge(); i++)


                {


                    karten.geheZuPosition(i);


                    Karte Karte_a = karten.aktuellesElement();           


                    karten.geheZuPosition(i+1);


                    Karte Karte_b = karten.aktuellesElement();


                    if(Karte_a.wert > Karte_b.wert||Karte_a.wert == Karte_b.wert && Karte_a.farbe < Karte_b.farbe)


                    {


                        karten.ersetzeAktuelles(Karte_a);


                        karten.geheZuPosition(i);


                        karten.ersetzeAktuelles(Karte_b);


                        sortiert = false;


                    }


                }





            }while(!sortiert);





        }





        endZeit=System.nanoTime();


        double d = endZeit - startZeit;


        d = d/1000000;





        zeichneKarten(0, 50, 150);


        infoEtikett.setzeInhalt("Erfolgreich Sortiert. Zeit: "+ d + " ms");


    }
