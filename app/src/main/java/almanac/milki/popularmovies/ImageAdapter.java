package almanac.milki.popularmovies;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by 1415019 on 29-04-2016.
 */
public class ImageAdapter extends ArrayAdapter<String> {

    private final Activity activity;
    private final String[] MoviePoster;

    ImageAdapter(Activity activity, String[] MoviePoster) {
        super(activity,R.layout.movie_single_poster,MoviePoster);
        this.activity = activity;
        this.MoviePoster=MoviePoster;


    }




    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();
        final View rowView= inflater.inflate(R.layout.movie_single_poster, null, true);

        ImageView imageView = (ImageView)rowView.findViewById(R.id.singlePoster);
        Picasso.with(activity).load(MoviePoster[i]).into(imageView);
        return rowView;
    }



}
