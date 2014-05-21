package com.mobien.myfirstapp.dashboard;




import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapterForSalesOrder extends BaseAdapter {

    /**
		 * Collection used for Search. Its the replica of the original data.
		 */
//		private ArrayList<ProductViewBean> mOriginalValues;
		private LayoutInflater inflater;
		/**
		 * Collection used for the product data
		 */
		private ArrayList<ProductViewBean> prodData;
		private final String TAG = "Sales order  Adapter";
		
		public CustomListAdapterForSalesOrder(ArrayList<ProductViewBean> data, Context mContext) {
			
			this.prodData = data;
			inflater = LayoutInflater.from(mContext);
				
			notifyDataSetChanged();
		}

		@Override
		public int getCount() {
			return prodData.size();
		}
		
		@Override
		public ProductViewBean getItem(int position) {
			return prodData.get(position);
		}
		
		@Override
		public long getItemId(int position) {
			
			return position;
		}


		
		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			
			final ViewHolder holder;
			
			if(convertView == null) {
				
				convertView = inflater.inflate(R.layout.component_sales_order_execution, null);
				holder = new ViewHolder();

				holder.tvProductName = (TextView) convertView.findViewById(R.id.tvProductName);
				holder.tvLastOrderQty = (TextView) convertView.findViewById(R.id.tvLastOrderedQty);
				holder.tvLastOrderDate = (TextView) convertView.findViewById(R.id.tvLastOrderDate);
				holder.tvLastInvoiceQty = (TextView) convertView.findViewById(R.id.tvInvQty);
				
				holder.tvRate = (TextView) convertView.findViewById(R.id.tvRate);
				holder.etQty = (EditText) convertView.findViewById(R.id.etQty);
				holder.ivScheme = (ImageView) convertView.findViewById(R.id.ivScheme);
				holder.ivSchemeApplied = (ImageView) convertView.findViewById(R.id.ivSchemeApplied);
				holder.llContainer = (LinearLayout) convertView.findViewById(R.id.llContainer);
//				holder.RLSchemeFlag = (RelativeLayout) convertView.findViewById(R.id.RLSchemeFlag);
				
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			
			Log.d(TAG, "Position getView : " + position);
			final ProductViewBean tempBean  = prodData.get(position);
			
			holder.etQty.setId(position);
			holder.ivScheme.setId(position);
			holder.llContainer.setId(position);
			holder.ivSchemeApplied.setId(position);
			holder.ivSchemeApplied.setVisibility(View.INVISIBLE);
			holder.ivScheme.setVisibility(View.INVISIBLE);
			
			if(tempBean.getTotalSchemeOnProduct() != null && tempBean.getTotalSchemeOnProduct().trim().length()>0){
//				BadgeView mSchemeCount = new BadgeView(mContext, holder.ivScheme);
//				mSchemeCount.setText(tempBean.getTotalSchemeOnProduct());
//				mSchemeCount.setBadgePosition(BadgeView.POSITION_TOP_RIGHT);
//				mSchemeCount.show();
				if(Integer.parseInt(tempBean.getTotalSchemeOnProduct())>0){
					holder.ivScheme.setVisibility(View.VISIBLE);
//					mSchemeCount.setVisibility(View.VISIBLE);
				}else {
					holder.ivScheme.setVisibility(View.INVISIBLE);
//					mSchemeCount.setVisibility(View.GONE);
				}
			} else {
				holder.ivScheme.setVisibility(View.INVISIBLE);
			}

			return convertView;
		}

    static class ViewHolder {

        TextView tvProductName;
        TextView tvLastOrderQty;
        TextView tvLastOrderDate;
        TextView tvLastInvoiceQty;
        TextView tvRate;
        EditText etQty;
        ImageView ivScheme;
        LinearLayout llContainer;
        ImageView ivSchemeApplied;
//		RelativeLayout RLSchemeFlag;

    }
	}
	
