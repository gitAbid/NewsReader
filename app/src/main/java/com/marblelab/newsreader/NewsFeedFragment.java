package com.marblelab.newsreader;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFeedFragment extends Fragment {


    private RecyclerView mNewsFeedCardRCV;
    private List<NewsFeed> mNewsFeedList;
    private NewsFeedListAdapter mNewsFeedListAdapter;

    public NewsFeedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_news_feed, container, false);

        mNewsFeedList=new ArrayList<>();
        mNewsFeedListAdapter=new NewsFeedListAdapter(getActivity().getApplicationContext(),mNewsFeedList);
        mNewsFeedCardRCV=(RecyclerView)view.findViewById(R.id.rcv_newsfeed);

        for (int i=0;i<10;i++){
            NewsFeed newsFeed=new NewsFeed(
                    "এফবিআই প্রধানকে বরখাস্ত করলেন ট্রাম্প",
                    "বিবিসি জানিয়েছে, অ্যাটর্নি জেনারেল জেফ সেশনসের সুপারিশের ভিত্তিতেই প্রসিডেন্ট ট্রাম্প এ সিদ্ধান্ত নিয়েছেন বলে হোয়াইট হাউজের ভাষ্য। তবে ডেমোক্র্যাটদের অভিযোগ, ট্রাম্পের নির্বাচনী প্রচারের সঙ্গে রাশিয়ার যোগাযোগ নিয়ে তদন্ত করছিলেন বলেই জেমস কোমিকে বরখাস্ত হতে হল। গত সপ্তাহে কংগ্রেসের শুনানিতে হিলারির ইমেইল নিয়ে কোমি পুরোপুরি সঠিক তথ্য দেননি- এমন তথ্য বেরিয়ে আসার পর হোয়াইট হাউজের এই পদক্ষ ...",
                    "এফবিআই প্রধানকে বরখাস্ত করলেন ট্রাম্প",
                    "বিবিসি জানিয়েছে, অ্যাটর্নি জেনারেল জেফ সেশনসের সুপারিশের ভিত্তিতেই প্রসিডেন্ট ট্রাম্প এ সিদ্ধান্ত নিয়েছেন বলে হোয়াইট হাউজের ভাষ্য। তবে ডেমোক্র্যাটদের অভিযোগ, ট্রাম্পের নির্বাচনী প্রচারের সঙ্গে রাশিয়ার যোগাযোগ নিয়ে তদন্ত করছিলেন বলেই জেমস কোমিকে বরখাস্ত হতে হল। গত সপ্তাহে কংগ্রেসের শুনানিতে হিলারির ইমেইল নিয়ে কোমি পুরোপুরি সঠিক তথ্য দেননি- এমন তথ্য বেরিয়ে আসার পর হোয়াইট হাউজের এই পদক্ষ ...",
                    "http://d30fl32nd2baj9.cloudfront.net/media/2017/05/10/fbi-director-comey.jpg/ALTERNATES/w640/FBI+Director+Comey.JPG",
                    "International",
                    "বিডিনিউজ টোয়েন্টিফোর ডটকম",
                    "2017-05-10 11:05:43.0 BdST",
                    true,
                    true);
            mNewsFeedList.add(newsFeed);
            mNewsFeedListAdapter.notifyDataSetChanged();
        }

        mNewsFeedCardRCV.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mNewsFeedCardRCV.setAdapter(mNewsFeedListAdapter);


        return view;

    }

}
