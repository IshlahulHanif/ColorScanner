package com.example.colorscanner.view

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.colorscanner.R
import com.example.colorscanner.contract.CameraTextureContract
import com.example.colorscanner.interactor.CameraTextureInteractor
import com.example.colorscanner.presenter.CameraTexturePresenter

class CameraTextureFragment : Fragment(), CameraTextureContract.View {
    private lateinit var presenter: CameraTextureContract.Presenter
    private lateinit var interactor: CameraTextureContract.Interactor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        interactor = CameraTextureInteractor(context!!)
        presenter = CameraTexturePresenter(this ,interactor)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.onViewCreated()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_camera_texture, container,false)
    }
}
