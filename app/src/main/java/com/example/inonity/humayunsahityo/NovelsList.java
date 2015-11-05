package com.example.inonity.humayunsahityo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class NovelsList extends AppCompatActivity {
    private String[] novels;
    ListView lvNovels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novels_list);


        //deal with list view
        lvNovels = (ListView) findViewById(R.id.listViewNovelsList);

        //initialize all th e novels in novels string
        initializeNovels();

        //display all the novels
        displayAllNovels();


        //deal with spinner
        String[] bookCategorySpinner = new String[]{
                " উপন্যাস ও গ্রন্থ সমগ্রি", " হিমু ", " মিসির আলি ", " শুভ্র", "সয়েন্স ফিকসন "
        };

        Spinner spinnerBookCategory = (Spinner) findViewById(R.id.spinnerBookCategory);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, bookCategorySpinner);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBookCategory.setAdapter(spinnerAdapter);

        spinnerBookCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                    displayAllNovels();
                else if (position == 1)
                    displayHimuNovels();
                else if (position == 2)
                    displayMisirAliNovels();
                else if (position == 3)
                    displayShuvroNovels();
                else if (position == 4)
                    displayScienceFictionNovels();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }



    private void displayAllNovels() {

        ArrayList<String> list = new ArrayList<>();
        for (String novel : novels) {
            list.add(novel);
        }

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lvNovels.setAdapter(adapter);
    }
    private void displayHimuNovels() {
        ArrayList<String> list = new ArrayList<>();
        for(int  i=186; i<210; i++){
            list.add(novels[i]);
        }
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lvNovels.setAdapter(adapter);
    }

    private void displayMisirAliNovels() {
        ArrayList<String> list = new ArrayList<>();
        for(int i=210; i<230; i++){
            list.add(novels[i]);
        }
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lvNovels.setAdapter(adapter);
    }

    private void displayScienceFictionNovels() {
        ArrayList<String> list = new ArrayList<>();
        for(int i=249; i<262; i++){
            list.add(novels[i]);
        }
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lvNovels.setAdapter(adapter);
    }
    private void displayShuvroNovels(){
        ArrayList<String> list = new ArrayList<>();
        for(int i=262;i< 266; i++){
            list.add(novels[i]);
        }
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lvNovels.setAdapter(adapter);
    }
    private void initializeNovels() {
        novels = new String[] {


                " নন্দিত নরকে ",
                " শঙ্খনীল কারাগার",
                " এইসব দিনরাত্রি",
                " জোছনা ও জননীর গল্প",
                " মন্দ্রসপ্তক",
                " দূরে কোথাও",
                " সৌরভ  ",
                " নি",
                " ফেরা",
                " কৃষ্ণপক্ষ",
                " সাজঘর",
                " বাসর",
                " গৌরীপুর জাংশান",
                " নৃপতি (নাটক)",
                " বহুব্রীহি",
                " আশাবরি",
                " দারুচিনি দ্বীপ",
                " শুভ্র",
                " নক্ষত্রের রাত",
                " আমার আছে জল",
                " কোথাও কেউ নেই",
                " আগুনের পরশমণি",
                " শ্রাবণ মেঘের দিন",
                " আকাশ জোড়া মেঘ",
                " শূন্য",
                " ইমা",
                " অমানুষ (অনুবাদ)",
                " অপেক্ষা",
                " মেঘ বলেছে যাবো যাবো",
                " দ্বিতীয় মানব",
                " ইস্টিশন",
                " মধ্যাহ্ন (অখণ্ড )",
                " মাতাল হাওয়া ",
                " শুভ্র গেছে বনে ",
                " ম্যজিক মুনসি",
                " একটি সাইকেল ও কয়েকটি ডাহুক পাখি",
                " দাঁড় কাকের সংসার মাঝে মাঝে তবো দেখা পাই",
                " আমরা কেউ বাসায় নেই (২০১২)",
                " মেঘের ওপারে বাড়ি (২০১২)",
                " বাদশাহ নামদার",
                " এপিটাফ",
                " রূপা",
                " রাক্ষক খোক্কস এবং ভোক্ষস",
                " পিপলী বেগম",
                " আজ চিত্রার বিয়ে",
                " এই মেঘ, রৌদ্রছায়া",
                " তিথির নীল তোয়ালে",
                " নবনী",
                " জলপদ্ম",
                " আয়নাঘর",
                " আমাদের শাদা বাড়ি",
                " চাঁদের আলোয় কয়েক জম যুবক",
                " জলকন্যা",
                " এলেবেলে",
                " যশোহা বৃক্ষের দেশে",
                " পরীর মেয়ে মেঘবতী",
                " বোকাভু",
                " ছেলেটা",
                " রূপার পালঙ্ক",
                " জোৎস্নাত্রয়ী",
                " কানী ডাইনী",
                " বৃষ্টি বিলাস",
                " যদিও সন্ধ্যা",
                " মৃন্ময়ী",
                " তেঁতুল বনে জোছনা",
                " কুটু মিয়া",
                " আসমানীরা তিন বোন",
                " নীল মানুষ",
                " উড়াল পঙ্খি ",
                " অচিনপুর",
                " আজ আমি কোথাও যাবনা",
                " একজন মায়াবতী",
                " তারা তিন জন",
                " রজনী",
                " শ্যামল ছায়া",
                " এই শুভ্র ! এই",
                " আমি এবং কয়েকটি প্রজাপ্রতি",
                " দিনের শেষে",
                " একা একা",
                " প্রথম প্রহর",
                " ছোটদের জন্য এক ব্যাগ হুমায়ূন বোকা রাজার সোনার সিংহাসন",
                " টগর এন্ড জেরী",
                " ব্যাঙ কন্যা এলেং",
                " কাক ও কাঠ গোলাপ",
                "  অরণ্য",
                "  এই বসন্তে",
                "  লীলাবতী",
                "  লিলুয়া বাতাস",
                "  কে কথা কয়? ",
                "  দিঘির জলে কার ছায়া গো",
                " আনন্দ বেদনার কাব্য",
                " মীর খাইয়ের অটোগ্রাফ",
                " বৃক্ষকথা",
                " আজ দুপুরে তোমার নিমন্ত্রণ",
                " গল্পপঞ্চাশৎ",
                " মানবী",
                " আয়োময়",
                " চক্ষে আমার তৃষ্ণা",
                " রূপালী দ্বীপ",
                " পাখি আমার একলা পাখি",
                " নলিনীবাবু Bsc",
                " মৃন্ময়ীর মন ভালো নেই",
                " কবি",
                " ভূত ভূতং ভূতৌ",
                " জনম জনম",
                " অনন্ত নক্ষত্র বীথি",
                " মীরার গ্রামের বাড়ি",
                " সুমদ্র বিলাস",
                " দ্বৈরথ",
                " ১৯৭১",
                " বাদল দিনের প্রথম কদমফুল",
                " বাদল দিনের দ্বিতীয় কদমফুল",
                " প্রিয় ভয়ংকর",
                " কিছুক্ষণ",
                " প্রিয় পদরেখা",
                " সূর্যের দিন",
                " যখন গিয়েছে ডুবে পঞ্চমীর চাঁদ",
                " দুই দুয়ারী",
                " মহাপুরুষ",
                " মঞ্চ নাটক ১৯৭১",
                "  দি একসরসিস্ট",
                "  সম্রাট",
                "  নিশিকাব্য",
                "  জল জোছনা",
                "  পোকা",
                "  ছায়াবীথি",
                "  পারুল ও তিনটি কুকুর",
                "  অদ্ভুত সব গল্প",
                "  চেরাগের দৈত্য এবং বাবলু",
                "  রুমালী",
                "  কালো জাদুকর",
                "  বৃষ্টি ও মেঘমালা",
                "  মেঘের ছায়া",
                "  ইরিনা",
                "  কুহক",
                "  পেন্সিলে আঁকা পরী",
                "  উদ্ভট গল্প",
                "  পুতুল",
                "  বোতলভূত",
                "  তোমাদের জন্য রূপকথা",
                "  নীল অপরাজিতা",
                "  জয়জয়ন্তী",
                "  প্রিয়তমেষু",
                "  ছোটদের সেরা গল্প",
                "  হলুদ পরী",
                "  বনের রাজা",
                "  ভুত মন্ত্র",
                "  একি কাণ্ড!",
                "  ছবি বানানোর গল্প",
                "  সানাউল্লার মহাবিপদ",
                "  অনিল বাগচীর একদিন",
                "  জীবনকৃষ্ণ মেমোরিয়াল হাই স্কুল",
                " তোমাকে",
                " মেঘ বলে চৈত্রে যাব",
                " শীত ও অন্যান্য গল্প ",
                " রোদন ভরা এই বসন্ত",
                " নুহাশ এবং আলাদিনের আশ্চর্য চেরাগ",
                " নীল হাতী",
                " এংগা, বেংগা, চেংগা",
                " মজার ভূত",
                " ধাঁধার জবাব",
                " মজার ছেলেবেলা",
                " ভয়ংকর ভুতুড়ে ",
                " তুমি আমায় ডেকে ছিলে ছুটির নিমন্ত্রনে",
                " অন্ধকারের গান",
                " ‎অপরাহ্ন",
                " সে ও নর্তকী",
                " অন্যদিন",
                " তোমাদের জন্য ভালবাসা",
                " নির্বাসন",
                " চৈত্রের দ্বিতীয় দিবস",
                " ছায়াসঙ্গী",
                " নয় নম্বর বিপদ সংকেত",
                " গৃহত্যাগী জোছনা",
                " বৃষ্টি ও জোছনা",
                " সেই মেয়েটি",
                " তিনি ও সে",
                " ভালবেসে যদি সুখ নাহি",
                " এসো করো স্নান",
                " বন বাতাসী",
                " অন্য ভুবন",
                " রাজার কুমার নিনিত",
                " দেয়াল (২০১৩ : শেষ উপন্যাস)",
                " কাকারু (২০১৪)",
                " লীলাবতীর মৃত্যু (২০১৪)",
                " একাত্তর এবং আমার বাবা(২০১৪)",
                " ময়ুরাক্ষী",
                " দরজার ওপাশে",
                " হিমু",
                " হিমুর হাতে কয়েকটি নীলপদ্ম",
                " এবং হিমু",
                " পারাপার",
                " হিমুর রুপালী রাত্রি",
                " একজন হিমু কয়েকটি ঝিঝি পোকা",
                " হিমুর দ্বিতীয় প্রহর",
                " তোমাদের এই নগরে",
                " সে আসে ধীরে",
                " আঙ্গুল কাটা জগলু",
                " হিমু মামা",
                " হলুদ হিমু কালো র‍্যাব",
                " আজ হিমুর বিয়ে",
                " হিমু রিমান্ডে",
                " হিমুর মধ্যদুপুর",
                " চলে যায় বসন্তের দিন",
                " হিমুর একান্ত সাক্ষাৎকার ও অন্যান্য",
                " হিমুর বাবার কথামালা",
                " হিমু এবং হার্ভার্ড Ph.D.বল্টুভাই",
                " হিমুর নীল জোছনা",
                " হিমু এবং একটি রাশিয়ান পরী",
                " হিমুর আছে জল",
                " দেবী",
                " নিশিথিনী",
                " নিষাদ",
                " অন্যভুবন",
                " বৃহন্নলা",
                " ভয়",
                " বিপদ",
                " অনীশ",
                " মিসির আলির অমিমাংসিত রহস্য",
                " আমি এবং আমরা",
                " তন্দ্রাবিলাস",
                " আমিই মিসির আলি",
                " বাঘবন্দী মিসির আলি",
                " কহেন কবি কালিদাস",
                " হরতন ইশকাপন",
                " মিসির আলির চশমা ",
                " মিসির আলি! আপনি কোথায়?",
                " মিসির আলি আনসলভ ",
                " যখন নামিবে আঁধার ",
                "  পুফি ",
                " বলপয়েন্ট",
                " কাঠপেন্সিল ",
                " ফাউন্টেইন পেন",
                " রংপেনসিল ",
                "  নিউইয়র্কের নীলাকাশে ঝকঝকে রোদ ",
                "  হোটেল গ্রেভার ইন",
                "  আমার ছেলেবেলা",
                "  কিছু শৈশব",
                "  এই আমি",
                "  সকল কাঁটা ধন্য করে",
                "  আমার আপন আঁধার",
                "   অনন্ত অন্বরে",
                "  মে ফ্লাওয়ার",
                "  আপনারে আমি খুঁজিয়া বেড়াই",
                "  রাবনের দেশে আমি ও আমরা",
                "  পায়ের তলায় খড়ম",
                "  দেখা না দেখা",
                "  নিউইয়র্ক এর নীল আকাশে ঝকঝকে রোদ",
                "  হিজিবিজি (২০১৩)",
                " তোমার জন্য ভালোবাসা ",
                " তারা তিন জন ",
                " অনন্ত নক্ষত্রবিথী ",
                " ফিহা সমীকরণ ",
                " ইরিণা",
                " কুহক ",
                " ইমা ",
                " ওমেগা পয়েন্ট ",
                " শুন্য ",
                " অন্য ভুবন ",
                " দ্বিতীয় মানব ",
                " অঁহক ",
                " মানবী ",
                " শুভ্র",
                " এই শুভ্র ! এই !",
                " দারুচিরি দ্বীপ",
                " শুভ্র গেছে বনে",
                " রূপাল দ্বীপ"

        };

    }
}
