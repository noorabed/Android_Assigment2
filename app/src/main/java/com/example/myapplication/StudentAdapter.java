package com.example.myapplication;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter .StudentVh>{

    Context context ;
    List<Student> students ;

    public StudentAdapter(Context context  , List<Student> students) {
        this.context = context;
        this.students = students;
    }
    @NonNull
    @Override
    public StudentVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_student ,parent , false );
        return new StudentVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVh holder, int position) {
        holder.setData(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
    class StudentVh extends RecyclerView.ViewHolder{

        TextView student_name , student_id  , student_avg, student_level;
        public StudentVh(@NonNull View itemView) {
            super(itemView);
            student_name = itemView.findViewById(R.id.student_name);
            student_id = itemView.findViewById(R.id.student_id);
            student_avg = itemView.findViewById(R.id.student_avg);
            student_level = itemView.findViewById(R.id.student_level);

        }

        public void setData(final Student student) {
            student_name .setText(student.getName());
            student_id.setText(student.getId());
            student_avg.setTextScaleX(student.getAvg());
            student_level.setText(student.getLevel());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, student.getName(), Toast.LENGTH_SHORT).show();
                    Intent  intent = new Intent(itemView.getContext() ,StudentActivity.class);
                    intent.putExtra("id",student.getId());
                    intent.putExtra("name",student.getName());
                    intent.putExtra("avg",student.getAvg());
                    intent.putExtra("level",student.getLevel());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}



