package in.premad.mvvmjava.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import in.premad.mvvmjava.MainActivity;
import in.premad.mvvmjava.Model.GetPlansDetails;
import in.premad.mvvmjava.R;

public class PlansAdapter extends RecyclerView.Adapter<PlansAdapter.MyViewHolder>  {
    Context context;
    List<GetPlansDetails> plansList;

    public PlansAdapter(Context context, List<GetPlansDetails> plansList) {
        this.context = context;
        this.plansList = plansList;
    }

    @NonNull
    @Override
    public PlansAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.plans_adapter,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlansAdapter.MyViewHolder holder, int position) {
        holder.planstext.setText(plansList.get(position).getPlanName());
        holder.amounttext.setText(plansList.get(position).getPlanAmount());

        holder.Viewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("plan_id",plansList.get(position).getPlanId());
                // passing the post id to the nxt activity.
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount()
    {
        return plansList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView planstext, amounttext;
        Button Viewmore;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            planstext = itemView.findViewById(R.id.planstext);
            Viewmore = itemView.findViewById(R.id.Viewmore);
            amounttext= itemView.findViewById(R.id.amounttext);
        }
    }
}
