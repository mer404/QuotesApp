package com.example.myquotes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuotesPageActivity extends AppCompatActivity {
    QuotesAdapter adapter;
    TextView txtCategories;
    ArrayList<ModelClassQuotes> MyQuotes = new ArrayList<>();
    RecyclerView rcvQuotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_page);
        initView();
    }

    private void initView() {
        txtCategories = findViewById(R.id.txtCategories);
        rcvQuotes = findViewById(R.id.rcvQuotes);

        if (getIntent() != null) {
            String Categories = getIntent().getStringExtra("CategoriesName");

            txtCategories.setText(Categories);

            if (Categories.equals("Birthday")) {
                birthday();
            } else if (Categories.equals("Work")) {
                work();
            } else if (Categories.equals("Fitness")) {
                fitness();
            } else if (Categories.equals("Sad")) {
                sad();
            } else if (Categories.equals("Cool")) {
                cool();
            } else if (Categories.equals("Cute")) {
                cute();
            } else if (Categories.equals("Funny")) {
                funny();
            } else if (Categories.equals("Life")) {
                life();
            } else if (Categories.equals("Love")) {
                love();
            } else if (Categories.equals("Selfie")) {
                selfie();
            }
            LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            rcvQuotes.setLayoutManager(manager);
            rcvQuotes.setAdapter(adapter);
        }
    }

    private void selfie() {
        ModelClassQuotes quoteOne = new ModelClassQuotes();
        quoteOne.setQuotes("I've made a friendSmile,it confuse people");
        MyQuotes.add(quoteOne);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("Sending your selfie to NASA because you're a star");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("I graduated from the university of selfies");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("This is the most magical pic of your life");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("OMG,Look at my selfie");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("Takes 2 selfies.. Deletes 22 selfies!");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);
    }

    private void love() {
        ModelClassQuotes quoteOne = new ModelClassQuotes();
        quoteOne.setQuotes("I want to be your last everything.");
        MyQuotes.add(quoteOne);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("I Love you dear with every beat of my heart.");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("Love is Like cold wind in summer.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("Roses are red,Sky is blue,My love is true and it's only for you...");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("Love is note just a Feelings,it's very important phase of our Life.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("Each day I LoVe YoU more,today more than yesterday,and less than tommorow.");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);
    }

    private void life() {
        ModelClassQuotes quoteOne = new ModelClassQuotes();
        quoteOne.setQuotes("You can do anything,but not everything.");
        MyQuotes.add(quoteOne);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("I'd rather have honest enemies than fake friends.");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("Life is not Much older than the death.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("Life is a big question that even google can't answer");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("There is nothing more exciting in the world but people.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("Where there are no flowers,human being cannot live.");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);
    }

    private void funny() {
        ModelClassQuotes quoteOne = new ModelClassQuotes();
        quoteOne.setQuotes("How can i miss something i never had?");
        MyQuotes.add(quoteOne);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("Dear MATH,stop asking to find your X, she's not coming back.");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("I really want to work so hard.But being lazy is so much fun.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("I came here in peace,seeking gold and slaves.");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("Please GOD if you can't make me slim, make my best friends fat.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("Onions make me sad. A lot of people don't realize that.");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);
    }

    private void cute() {
        ModelClassQuotes quoteOne = new ModelClassQuotes();
        quoteOne.setQuotes("A smile is the best makeup any girl can wear.");
        MyQuotes.add(quoteOne);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("You glow differently when you're actually happy.");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("You'll never get over with a crush,until you find a new one.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("I'm so glad you are in my life but i want to be more than friends.");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("Maybe,just a little... i could possibly be... falling for you.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("You are all I ever think about.");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);
    }

    private void cool() {

        ModelClassQuotes quoteOne = new ModelClassQuotes();
        quoteOne.setQuotes("If you hotter than me, That than means I'm cooler than you.");
        MyQuotes.add(quoteOne);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("How come wrong numbers are never busy ?");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("Your whatsapp status say's online...If your online than, why aren't you messge me !");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("Yes I am smilling  and you're not the reason anymore.");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("I am not arguing,i'm simply explaining why i am right.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("Life is like riding a bicycle to keep your balance,you must keep moving. ");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);
    }

    private void sad() {
        ModelClassQuotes data = new ModelClassQuotes();
        data.setQuotes("The most painfull memory.When I walked away and you let me go.");
        MyQuotes.add(data);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("The CURE of anything is salt WATER-Sweat,Tear,or the SEA.");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("There's nothing more depressing than having it all and still feeling sad.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("Anger is a felling that makes your mouth work faster than your mind.");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("I close my eyes and dream of a time when i wasn't all alone.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("I hate it when crying is the only way to feel better.");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);

    }

    private void fitness() {

        ModelClassQuotes data = new ModelClassQuotes();
        data.setQuotes("WINNERS focus on winning ,LOSERS focus on WINEERS.");
        MyQuotes.add(data);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("Be the Best version of you.");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("Believe in yourSelf and you will be Unstoppable.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("Excuses Don't kill the fat, Exercises Do.");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("Ability is limitless, Be more do more.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("Your Body is your slave .It works for you.So you need to pay.");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);

    }

    private void work() {
        ModelClassQuotes data = new ModelClassQuotes();
        data.setQuotes("With HardWork and efforts,you can achieve anything.");
        MyQuotes.add(data);

        ModelClassQuotes data1 = new ModelClassQuotes();
        data1.setQuotes("Why do today what you can put off till tomorrow.");
        MyQuotes.add(data1);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("I have this thing called a job.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("The only reason I go to work is for the MONEY.");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("I owe,I owe,so it's off to work i go.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("I'm Working hard...or am i hardly working?");
        MyQuotes.add(data5);

        adapter = new QuotesAdapter(MyQuotes);

    }

    private void birthday() {
        ModelClassQuotes dataOne = new ModelClassQuotes();
        dataOne.setQuotes("Happy birthday, My friend.I can't imagine celebrating with anyone else.");
        MyQuotes.add(dataOne);

        ModelClassQuotes dataTwo = new ModelClassQuotes();
        dataTwo.setQuotes("I wish you Happy Birthday i wish you many more,i wish many more,i wish you peace and happiness...");
        MyQuotes.add(dataTwo);

        ModelClassQuotes data2 = new ModelClassQuotes();
        data2.setQuotes("It's Always a treat to wish happy birthday to someone so sweet.");
        MyQuotes.add(data2);

        ModelClassQuotes data3 = new ModelClassQuotes();
        data3.setQuotes("Happy Birthday to my darling little lucky may it be good sweet and filled with happy times.");
        MyQuotes.add(data3);

        ModelClassQuotes data4 = new ModelClassQuotes();
        data4.setQuotes("The sun is Shining more lightly today as a way to wish you Happy Birthday.");
        MyQuotes.add(data4);

        ModelClassQuotes data5 = new ModelClassQuotes();
        data5.setQuotes("True Love is a gift we all posses it is the key of heart&Souls happiness...Happy Birthday");
        MyQuotes.add(data5);
        adapter = new QuotesAdapter(MyQuotes);
    }
}